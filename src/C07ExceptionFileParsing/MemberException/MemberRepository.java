package C07ExceptionFileParsing.MemberException;

import C07ExceptionFileParsing.MemberException.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
//DB에 CRUD를 수행하는 계층
public class MemberRepository {
    private List<C07ExceptionFileParsing.MemberException.Member> memberList;
    public MemberRepository(){
        this.memberList = new ArrayList<>();
    }
    public void register(C07ExceptionFileParsing.MemberException.Member member){
        this.memberList.add(member);
    }
    public Optional<Member> findByEmail(String email){
        Member member = null;
        for (Member m : memberList){
            if(m.getEmail().equals(email)){
                member = m;
                break;
            }

        }
        return Optional.ofNullable(member);
    }

    public Optional<Member> findById(long id){
        Member member = null;
        for (Member m : memberList){
            if(m.getId()==id){
                member = m;
                break;
            }
        }
        return member;
    }

    public List<Member> findAll(){
        return this.memberList;
    }
}