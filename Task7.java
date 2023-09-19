package JavaProject2;
//You have a list of strings and you want to keep only those that start
//with “A” and you want to return them in lower case"

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static List<String>method(List<String>inputList){
      List<String>methodList = new ArrayList<String>();
      for(String input : inputList){
          if(input.startsWith("A")){
              methodList.add(input.toLowerCase());

          }
      }
      return methodList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<String>();
        inputList.add("Apple");
        inputList.add("Banana");
        inputList.add("Avocado");
        inputList.add("Cherry");
        List<String> result=method(inputList);
        System.out.println("Filtered and Lowercased List:");
        for(String input : result){
            System.out.println(input);
        }

    }
}
