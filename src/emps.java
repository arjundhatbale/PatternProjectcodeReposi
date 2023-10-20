public class emps {
    private String Name;
    private String Pincode;
    private int Id;

    public emps(String name, String pincode, int id) {
        this.Name = name;
        this.Pincode = pincode;
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "emps{" +
                "Name='" + Name + '\'' +
                ", Pincode='" + Pincode + '\'' +
                ", Id=" + Id +
                '}';
    }
}
