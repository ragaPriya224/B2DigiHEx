package src.day4;

public   class Parent {
    public final String company = "tcs";
    public static void main(String[] args) {
        Parent o = new Parent();
        o.wealth();
    }

    public void wealth() {
        System.out.println("cash" + "land" + "home" + "stocks" + "gold");
        company = "google";
        System.out.println(company);
    }

    public final void toMarry() {
        System.out.println("user1");
    }

    public void home() {
        System.out.println("2 chair");
    }
}
