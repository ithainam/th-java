package fit.hutech.tranhuynhhainam;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {
    public static void main(String[] args)
    {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword ="HaiNam";
        String encoderPass = encoder.encode(rawPassword);
        System.out.println(encoderPass);
    }
}
