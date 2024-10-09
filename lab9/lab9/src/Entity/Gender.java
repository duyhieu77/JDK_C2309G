package Entity;

public enum Gender {
    M("male"), F("femele");
    private String gender;
    Gender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
