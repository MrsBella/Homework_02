package pl.coderslab.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Controller
public class HelloController {

    @GetMapping("/workers")
    public String workerAction(Model model) throws IOException {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 30);

        InputStream inputStream = new ClassPathResource("Workers.txt").getInputStream();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String workers = reader.lines().collect(Collectors.joining("\n"));
            String[] array = workers.split("\n");
            System.out.println(Arrays.asList(array));
            for (int i = 0; i < array.length; i++) {
                String[] worker = array[i].split(",");
                int number = Integer.parseInt(worker[0]);
                if (randomNumber == number) {
                    model.addAttribute("worker", worker[1]);
                }
            }
        }
        return "workers";
    }
}
