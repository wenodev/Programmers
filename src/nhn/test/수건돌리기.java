package nhn.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Person{

    char name;
    int number;

    Person(char name, int number){
        this.name = name;
        this.number = number;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}



class Main {
    private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
        // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.

        List<Person> personList = new ArrayList<>();

        int towel=1;

        for (int i=0; i<numOfAllPlayers; i++){
            personList.add(new Person(((char)(65+i)), 0));
        }

        personList.get(0).setNumber(1);

        personList.forEach(person -> {
            System.out.println("person.getName() : " + person.getName());
            System.out.println("person.getNumber() : " + person.getNumber());
            System.out.println();
        });

        for (int i=0; i<numOfGames; i++){

            towel += numOfMovesPerGame[i];

            for (int j=0 ;j<numOfQuickPlayers; j++){
                if (personList.get(towel).getName() == namesOfQuickPlayers[j]){
                    personList.get(towel).setNumber(personList.get(towel).getNumber() + 1);
                    i++;
                    break;
                }
            }





        }









    }

    private static class InputData {
        int numOfAllPlayers;
        int numOfQuickPlayers;
        char[] namesOfQuickPlayers;
        int numOfGames;
        int[] numOfMovesPerGame;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
            System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

            inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.numOfMovesPerGame = new int[inputData.numOfGames];
            String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            for(int i = 0; i < inputData.numOfGames ; i++){
                inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
    }
}