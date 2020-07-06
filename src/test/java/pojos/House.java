package pojos;

public class House {

    private String _id;
    private String name;
    private String mascot;
    private String headOfHouse;
    private String houseGhost;

    @Override
    public String toString() {
        return "House{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", mascot='" + mascot + '\'' +
                ", headOfHouse='" + headOfHouse + '\'' +
                ", houseGhost='" + houseGhost + '\'' +
                ", founder='" + founder + '\'' +
                ", __v='" + __v + '\'' +
                ", school='" + school + '\'' +
                ", members='" + members + '\'' +
                '}';
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(String headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    public String getHouseGhost() {
        return houseGhost;
    }

    public void setHouseGhost(String houseGhost) {
        this.houseGhost = houseGhost;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String get__v() {
        return __v;
    }

    public void set__v(String __v) {
        this.__v = __v;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    private String founder;
    private String __v;
    private String school;
    private String members;

    public House(String _id, String name, String mascot, String headOfHouse, String houseGhost, String founder, String __v, String school, String members) {
        this._id = _id;
        this.name = name;
        this.mascot = mascot;
        this.headOfHouse = headOfHouse;
        this.houseGhost = houseGhost;
        this.founder = founder;
        this.__v = __v;
        this.school = school;
        this.members = members;
    }
}
