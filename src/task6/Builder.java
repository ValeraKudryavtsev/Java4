package task6;

public class Builder {
    public static void main(String[] args) {
        FIFACard LeoMessi = new FIFACard.BuilderCard("Leo Messi").
                setPosition("RW").setClub("FC Barcelona").setRating(93).build();

        System.out.println(LeoMessi.getName());
        System.out.println(LeoMessi.getPosition());
        System.out.println(LeoMessi.getClub());
        System.out.println(LeoMessi.getRating());
    }
}

class FIFACard {
    private String name;
    private String position = "not determined";
    private String club = "not determined";
    private int rating = 0;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getClub() {
        return club;
    }

    public int getRating() {
        return rating;
    }

    private FIFACard(BuilderCard builderCard) {
        this.name = builderCard.name;
        this.position = builderCard.position;
        this.club = builderCard.club;
        this.rating = builderCard.rating;
    }

    static class BuilderCard {
        private String name;
        private String position;
        private String club;
        private int rating;

        public BuilderCard(String name) {
            this.name = name;
        }

        public BuilderCard setPosition(String position) {
            this.position = position;
            return this;
        }

        public BuilderCard setClub(String club) {
            this.club = club;
            return this;
        }

        public BuilderCard setRating(int rating) {
            this.rating = rating;
            return this;
        }

        public FIFACard build() {
            return new FIFACard(this);
        }
    }
}

