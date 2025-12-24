//package C07ExceptionFileParsing;
//
//
//import C02MethodClass.Post;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//public class C05HttpJsonParsing {
//    public static void main(String[] args) throws IOException, InterruptedException {
////        외부에서 데이터를 받아 java의 객체로 변환
////        외부api요청을 하기 위한 라이브러리 : HttpClient, RestTemplate, RestClient
////        HttpClient는 java내장클래스(잘 안쓰임).
////        RestTemplate, RestClient는 스프링에서 가장 많이 사용하는 클래스
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")).GET().build();
//        HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers.ofString());
//        String data = response.body();
//        System.out.println(data);
//        ObjectMapper o1 = new ObjectMapper();
//
////        객체로 파싱
//        Post p1 = o1.readValue(data, post.class);
//
////        리스트형식의 객체로 파싱
//        HttpRequest request2 = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts")).GET().build();
//
//    }
//}
//class post {
//    private long userId;
//    private long id;
//    private String title;
//    private String body;
//
//    public Post(long uerrId, long id, String title, String body) {
//        this.uerrId = uerrId;
//        this.id = id;
//        this.title = title;
//        this.body = body;
//    }
//
//    public long getUerrId() {
//
//        return uerrId;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    @Override
//    public String toString() {
//        return "{" +
//                "uerrId=" + uerrId +
//                ", id=" + id +
//                ", title='" + title + '\'' +
//                ", body='" + body + '\'' +
//                '}';
//    }
//}
