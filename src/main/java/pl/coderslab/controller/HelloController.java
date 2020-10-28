package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class HelloController {

    @GetMapping("/workers")
    public String workerAction(Model model) throws FileNotFoundException {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 30);

        File file = new File("Workers.txt");
        System.out.println(file.exists());
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.next());
//                String[] workers = scanner.nextLine().split(",");
//                int number = Integer.parseInt(workers[0]);
//                if (randomNumber == number) {
//                    model.addAttribute("worker", workers[1]);
                }
        } catch (FileNotFoundException e) {
            return "brakPliku";
        }

        return "workers";
    }
}
