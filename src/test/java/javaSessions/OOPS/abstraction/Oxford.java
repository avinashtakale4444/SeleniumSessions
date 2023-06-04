package javaSessions.OOPS.abstraction;

public class Oxford extends Pune implements UKUniversity {
    @Override
    public void europeanSubjects() {
        System.out.println("Only european students are allowed");
    }



    @Override
    public void universityName() {
        System.out.println("Oxford");

    }

    @Override
    public void globalRules() {
        System.out.println("Maximum student size should be : "+studentSize);
    }

    @Override
    public void courses() {
        System.out.println("Agriculture");
    }

    @Override
    public void totalUniversities() {
        System.out.println("Total universities in UK are : "+300);
    }
}
