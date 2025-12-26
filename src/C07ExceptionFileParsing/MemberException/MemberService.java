package C07ExceptionFileParsing.MemberException;

import C07ExceptionFileParsing.MemberException.Member;
import C07ExceptionFileParsing.MemberException.MemberRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//핵심로직을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;
    public MemberService(){
        memberRepository = new MemberRepository();
    }
    public void register(String name, String email, String password) throws IllegalArgumentException{
//        List(DB)에 이메일이 중복일경우 예외발생(IllegalArguments)
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        if(optionalMember.isPresent()){
            throw new IllegalArgumentException("이메일 중복입니다.");
        }
//        객체 조립 후 repository를 통해 저장
        Member newMember = new Member(name, email, password);
        memberRepository.register(newMember);
    }

    public Member findById(long id) throws NoSuchElementException {
        Optional<Member> optionalMember = memberRepository.findById(id);
//            예외 발생
        Member member = optionalMember.orElseThrow(() -> new NoSuchElementException("없는 사용자입니다."));
        return member;

//        위에 3줄 간단히 1줄로.
//        return memberRepository.findById(id).
//              orElseThrow(()->new NoSuchElementException("없는 사용자입니다."));
    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    public void login(String email, String password) throws NoSuchElementException, IllegalArgumentException{
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
//        email이 있는지 확인 후 없으면 예외발생
        Member member = optionalMember.orElseThrow(()-> new NoSuchElementException("잘못된 이메일입니다."));
//        password가 일치한지 확인 후 일치하지 않으면 예외 발생
        if(member.getPassword().equals(password)){
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }



    }

}