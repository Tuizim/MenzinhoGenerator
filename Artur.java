import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Artur {
    static final String name = "ARTUR TROMBIM DE SOUSA";
    static final String currentPosition = "Software Development Intern";
    static final List<String> SomeSkills = Arrays.asList("Music", "Teaching", "Organization");
    static final List<String> languages = Arrays.asList("Java", "C#", "Python", "SQL");
}

public class Mateus extends Artur {
    static final String name = "MATEUS ROSOLEM BARONI";
    
    static final List<String> SomeSkills = new ArrayList<String>() {{
        add("Coding");
        add("Goiabada");
    }};
    
    static final List<String> languages = new ArrayList<String>() {{
        add("Airpods");
        add("SmartFit");
    }};
}
