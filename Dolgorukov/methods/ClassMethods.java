package ru.Dolgorukov.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class ClassMethods {
    public <T> List<T> deleteList(List<T> list, T meaningDelete) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), meaningDelete)) {
                list.remove(i);
                i -= 1;
            }
        }
        return list;
    }

//    public void task4() {
//        Scanner scanner = null;
//        List<String> names = new ArrayList<>();
//        int max = 0;
//        String name = "";
//        int scores = 0;
//        try {
//            scanner = new Scanner(new File("file4.txt"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        int countPeople = Integer.parseInt(scanner.next());
//        int j = 0;
//        while (scanner.hasNext() || j != countPeople) {
//            name
//                    = scanner.next() + " " + scanner.next();
//            scores = Integer.parseInt(scanner.next())
//                    + Integer.parseInt(scanner.next())
//                    + Integer.parseInt(scanner.next());
//            if (scores == max) {
//                names.add(name);
//            }
//            if (scores > max) {
//                names.clear();
//                max = scores;
//                names.add(name);
//            }
//            name = "";
//            scores = 0;
//            j += 1;
//        }
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        scanner.close();
//    }

    public void task4() {
        Scanner scanner = null;
        SortedMap<Integer, List<String>> scoreStudents = new TreeMap<>(Comparator.reverseOrder());
        int max = 0;
        String name = "";
        int scores = 0;
        try {
            scanner = new Scanner(new File("file4.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int countPeople = Integer.parseInt(scanner.next());
        int j = 0;
        while (scanner.hasNext() || j != countPeople) {
            name = scanner.next() + " " + scanner.next();
            scores = Integer.parseInt(scanner.next())
                    + Integer.parseInt(scanner.next())
                    + Integer.parseInt(scanner.next());
            if (!scoreStudents.containsKey(scores)) {
                scoreStudents.put(scores, new ArrayList<>());
            }
            scoreStudents.get(scores).add(name);
            if (scores > max) {
                max = scores;
            }
            name = "";
            scores = 0;
            j += 1;
        }
        List<String> topStudents = scoreStudents.get(scoreStudents.firstKey());
        for (String student : topStudents) {
            System.out.println(student);
        }
        scanner.close();
    }

    public void task5() {
        Scanner scanner = null;
        Set<Character> allLetters = new HashSet<>();
        Set<Character> inOneWord = new HashSet<>();
        Set<Character> letters = new HashSet<>();
        String word = "";
        try {
            scanner = new Scanner(new File("file5.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int charCode = 0;
        while (scanner.hasNext()) {
            word = scanner.next().toLowerCase();
            for (int i = 0; i < word.length(); i++){
                charCode = (int) word.charAt(i);
                if ((charCode >= 1073 && charCode <= 1076)
                        || (charCode >= 1078 && charCode <= 1079)
                        || (charCode >= 1081 && charCode <= 1085)
                        || (charCode >= 1087 && charCode <= 1090)
                        || (charCode >= 1092 && charCode <= 1097)) {
                    letters.add(word.charAt(i));
                }
            }
            List<Character> listLetters = new ArrayList<>(letters);
            for (int i = 0; i < listLetters.size();i++){
                if (!allLetters.contains(listLetters.get(i))){
                    if (inOneWord.contains(listLetters.get(i))){
                        allLetters.add(listLetters.get(i));
                        inOneWord.remove(listLetters.get(i));
                    } else {
                        inOneWord.add(listLetters.get(i));
                    }
                }
            }
            listLetters.clear();
            letters.clear();
        }
        List<Character> sortedList = inOneWord.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Согласные буквы, которые встречаются только в одном слове: ");
        for (int i = 0; i < sortedList.size();i++) {
            System.out.print(sortedList.get(i) + " ");
        }
        scanner.close();
    }

    public <T> boolean task6(Queue<T> queue, int i, int j){
        boolean flag = true;
        List<T> listQueue = new ArrayList<>(queue);
        T first = listQueue.get(i);
        for (int q = i + 1; q <= j; q++){
            if (!listQueue.get(q).equals(first)){
                flag = false;
            }
        }
        return flag;
    }

    public void task72(){
        try {
            Map<Integer, List<String>> result = Files.lines(Paths.get("file7(2).txt"))
                    .map(line -> line.split(":"))
                    .filter(parts -> parts.length == 2 && !parts[1].trim().isEmpty())
                    .collect(Collectors.groupingBy(
                            parts -> Integer.parseInt(parts[1].trim()),
                            Collectors.mapping(
                                    parts -> {
                                        String name = parts[0].trim().toLowerCase();
                                        return name.substring(0, 1).toUpperCase() + name.substring(1);
                                    },
                                    Collectors.toList()
                            )
                    ));
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

