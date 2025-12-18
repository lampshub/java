package C02MethodClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10BoardService {
    public static void main(String[] args) {
         /*
        <게시판서비스>
        1.계좌객체 : Author, Post
        2.자료구조 : List(authorList, postList)
        3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
            3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
            3-2.회원 전체 목록 조회 : id, email
            3-3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
            3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
            3-5.게시물 목록 조회 : id(post), title
            3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름
     */
//        수업중 설명 12/17 4시~
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();
        while (true) {
            System.out.println("사용하실 서비스 번호를 입력해주세요. \n 1. 회원가입 2. 회원 전체 목록조회 3. 회원 상세조회 4. 게시글 작성 5. 게시물 목록조회 6. 게시물 상세조회");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if (number==1) {
                System.out.println("회원가입 서비스입니다. \n 이름, 이메일, 비밀번호를 입력해주세요");
                String name = sc.nextLine();
                String email = sc.nextLine();
                String password = sc.nextLine();
                if (authorList.contains(email)) {
                    System.out.println("이미 회원가입된 이메일입니다.");
                } else {
                    authorList.add(new Author(name, email, password));
                    System.out.println("회원가입 완료되었습니다.");
                }
            } else if (number==2) {
                System.out.println("회원목록조회서비스입니다.");    // id, email
                for( Author a : authorList){
                    System.out.println("id는 "+ a.getId() + " email은 "+ a.getEmail());
                }
            } else if (number==3) {
                System.out.println("회원상세조회서비스입니다. \n ID를 입력해주세요.");
//회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
                long id = Long.parseLong(sc.nextLine());
                Author author = null;
                for(Author a : authorList) {
                    if(a.getId() == id){
                        author = a;
                        break;
                    }
                }
//                System.out.println("id는 " + author.getId() + "..." + " 작성글 수는 " + count);

            } else if (number==4) {
//                4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
            }


        }
    }
}

class Author{
    //이름, 이메일, 비밀번호, id값
    private Long id;
    private String name;
    private String email;
    private String password;
    private static long staticId;

    public Author(String name, String email, String password){
        staticId++;
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    List<Post> postList; //author가 post를 작성할때마다 개수 =셈
}

class Post {
    private Long id;
    private String title;
    private String content;
    private String authorEmail;
    private static long staticId;

    public Post(String title, String content, String authorEmail) {
        staticId++;
        this.id = staticId;
        this.title = title;
        this.content = content;
        this.authorEmail = authorEmail;
//    작성자Email(직접 Author 객체를 변수로 갖는것도 가능) -> 어떻게 ?
//    private Author author;  //author의 메모리 주소
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", authorEmail='" + authorEmail + '\'' +
                '}';
    }

}