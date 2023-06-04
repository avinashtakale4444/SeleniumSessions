package javaSessions.OOPS.abstraction;

public class Harvard extends Pune implements USUniversity {
    @Override
    public void usSubjects() {
        System.out.println("Only usa students are allowed");
    }

    @Override
    public void universityName() {
        System.out.println("Harvard");
    }

    @Override
    public void globalRules() {
        System.out.println("Graduation years should be :  "+graduationYears);
    }

    @Override
    public void courses() {
        System.out.println("Horticulture");
    }

    @Override
    public void totalUniversities() {
        System.out.println("total universties in USA are : "+400);
    }
}
