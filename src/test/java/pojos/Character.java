package pojos;

public class Character {

    private String _id;
    private String name;

    @Override
    public String toString() {
        return "Character{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", house='" + house + '\'' +
                ", school='" + school + '\'' +
                ", __v='" + __v + '\'' +
                ", ministryOfMagic='" + ministryOfMagic + '\'' +
                ", orderOfThePhoenix='" + orderOfThePhoenix + '\'' +
                ", dumbledoresArmy='" + dumbledoresArmy + '\'' +
                ", deathEater='" + deathEater + '\'' +
                ", bloodStatus='" + bloodStatus + '\'' +
                ", species='" + species + '\'' +
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String get__v() {
        return __v;
    }

    public void set__v(String __v) {
        this.__v = __v;
    }

    public String getMinistryOfMagic() {
        return ministryOfMagic;
    }

    public void setMinistryOfMagic(String ministryOfMagic) {
        this.ministryOfMagic = ministryOfMagic;
    }

    public String getOrderOfThePhoenix() {
        return orderOfThePhoenix;
    }

    public void setOrderOfThePhoenix(String orderOfThePhoenix) {
        this.orderOfThePhoenix = orderOfThePhoenix;
    }

    public String getDumbledoresArmy() {
        return dumbledoresArmy;
    }

    public void setDumbledoresArmy(String dumbledoresArmy) {
        this.dumbledoresArmy = dumbledoresArmy;
    }

    public String getDeathEater() {
        return deathEater;
    }

    public void setDeathEater(String deathEater) {
        this.deathEater = deathEater;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    private String role;
    private String house;
    private String school;

    public Character(String _id, String name, String role, String house, String school, String __v, java.lang.String ministryOfMagic, String orderOfThePhoenix, String dumbledoresArmy, String deathEater, String bloodStatus, String species) {
        this._id = _id;
        this.name = name;
        this.role = role;
        this.house = house;
        this.school = school;
        this.__v = __v;
        this.ministryOfMagic = ministryOfMagic;
        this.orderOfThePhoenix = orderOfThePhoenix;
        this.dumbledoresArmy = dumbledoresArmy;
        this.deathEater = deathEater;
        this.bloodStatus = bloodStatus;
        this.species = species;
    }

    private String __v;
    private String ministryOfMagic;
    private String orderOfThePhoenix;
    private String dumbledoresArmy;
    private String deathEater;
    private String bloodStatus;
    private String species;


}
