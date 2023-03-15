package constant;
import java.text.SimpleDateFormat;

public class Constant {
    public static final int NAME_LENGTH = 100;
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    public static final int ADDRESS_LENGTH = 300;
    
    public static class Height{
        public static final double MIN = 50;
        public static final double MAX = 300;
    }
    public static class Weight{
        public static final double MIN = 5;
        public static final double MAX = 1000;
    }
    public static final int STUDENT_ID_LENGTH = 10;
    public static final int UNIVERSITY_LENGTH = 200;

    public static class UniversityStartYear{
        public static final int YEAR_MIN = 1900;
        public static final int YEAR_MAX = 2023;
        public static final int YEAR_LENGTH = 4;
    }

    public static class GPA{
        public static final double MIN = 0;
        public static final double MAX = 10;
    }
}
