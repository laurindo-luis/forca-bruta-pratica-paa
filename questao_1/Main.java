package questao_1;

public class Main {
  public static void main(String[] args) {
    Integer[] numbers = {10, 19, 16, 23, 15, 4, 20, 9, 30, 8, 1};
    Integer quantityOfNumbers = numbers.length;
    Integer numberToSearch = 4;

    for(int i = 0; i < quantityOfNumbers; i++) {
      for(int j = 0; j < quantityOfNumbers; j++) {
        if(i != j) {
          Integer result = numbers[i] - numbers[j];
          if (result == numberToSearch) {
            System.out.println(String.format("Pair: %d - %d = %d",
                    numbers[i], numbers[j], result));
          }
        }
      }
    }
  }
}
