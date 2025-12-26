package C07ExceptionFileParsing.MemberException;

//객체 - 엔티티
public class Member {
    private static Long statciId = 0L;
    private Long id;
    private String name;
    private String email;
    private String password;

    public Member(Long id, String name, String email, String password) {
        statciId++;
        this.id = statciId;
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
}


//실습 관련
//1. 코드작성, 예외처리
//2. optional