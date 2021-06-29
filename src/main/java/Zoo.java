public class Zoo {
    private String animalName;
    private Integer age;
    private Character sex;
    private String animal;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animalName='" + animalName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", animal='" + animal + '\'' +
                '}';
    }
}
