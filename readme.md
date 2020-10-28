   1. Stwórz projekt **Homework_02**. Rozwiązania zadań powinny znajdować się w tym projekcie.

## Zadanie 1

   1. Stwórz kontroler o nazwie `HeaderController`.
   
   2. Stwórz akcję dostępną pod adresem `/showUserAgent`.
   3. Pobierz wartość nagłówka `userAgent`.
   4. Utwórz widok dla tej akcji o nazwie `userAgent.jsp`.
   5. Przekaż, a następnie wyświetl w widoku parametr.

## Zadanie 2

   1. Stwórz kontroler o nazwie `RedirectController`.
   
   2. Utwórz akcję dostępną pod adresem `/first`. Akcja ma ma wyświetlać widok `first.jsp`.
   3. Utwórz akcję dostępną pod adresem `/third.` Akcja ma ma wyświetlać widok `third.jsp`.
   4. W widoku `first.jsp` utwórz link do akcji dostępnej pod adresem `/second`, akcja ma przekierowywać do akcji 
   dostępnej pod adresem `/third`.

## Zadanie 3

   1. Utwórz widok o nazwie `workers.jsp`.
   
   2. W kontrolerze `HelloController` utwórz akcję `workersAction`, dostępną pod adresem `/workers`, która wyświetli 
   ten widok.
   3. Dodaj do projektu plik o nazwie `Workers.txt`.
   4. Plik `Workers.txt` wypełnij listą pracowników (wpisz je samodzielnie):

            01, Jan Kowalski
            05, Jan Wiśniewski
            10, Jan Marek
            29, Jan Janecki
            30, Jan Nowak

   5. W metodzie kontrolera napisz kod który:
       * Wylosuje liczbę od 1 do 30.
       * Otworzy plik `Workers.txt` i znajdzie w nim osobę odpowiadającą wylosowanej liczbie.
       * Przekaże wylosowaną wartość do widoku, np `Jan Kowalski`.
   6. Wyświetl zawartość w widoku `workers.jsp`.
