import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UrlFromHandles{

  public static void main(String[] args){
    // Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
    // GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

    // example:
    // input: ["ghhandle1", "ghhandle2"]
    // output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]
    System.out.println(urlsFromHandles(Arrays.asList("ghhandle1", "ghhandle2")));

  }

  public static ArrayList<String> urlsFromHandles (List<String> gitHubHandleList) {

    ArrayList<String> urlList = new ArrayList<>();

    String beginningOfUrl = "https://github.com/greenfox-academy/";

    for (int i = 0; i < gitHubHandleList.size(); i++) {
      urlList.add("\"" + beginningOfUrl + gitHubHandleList.get(i) + "\"");
    }
    return urlList;
  }
}