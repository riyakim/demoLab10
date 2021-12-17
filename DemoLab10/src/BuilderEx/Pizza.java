package BuilderEx;

public class Pizza {
    boolean tomato;
    boolean pepperoni;
    boolean mozzarella;
    boolean olives;
    String dim;
    String type;

    public static class Builder {
        boolean tomato;
        boolean pepperoni;
        boolean mozzarella;
        boolean olives;
        String dim;
        String type;

        public Builder(String dim, String type) {
            this.dim = dim;
            this.type = type;
        }

        public Builder tomato() {
            tomato = true;
            return this;
        }

        public Builder pepperoni() {
            pepperoni = true;
            return this;
        }

        public Builder mozzarella() {
            mozzarella = true;
            return this;
        }

        public Builder olives() {
           olives = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder b) {
        dim = b.dim;
        type = b.type;
        tomato = b.tomato;
        mozzarella = b.mozzarella;
        pepperoni = b.pepperoni;
        olives = b.olives;
    }
//    public Pizza(boolean tomato, boolean pepperoni, boolean mozzarella, boolean olives, String dim, String type) {
//        this.tomato = tomato;
//        this.pepperoni = pepperoni;
//        this.mozzarella = mozzarella;
//        this.olives = olives;
//        this.dim = dim;
//        this.type = type;
//    }
//
//    public Pizza(String dim, String type) {
//        this.dim = dim;
//        this.type = type;
//    }
//
//    public boolean isTomato() {
//        return tomato;
//    }
//
//    public void setTomato(boolean tomato) {
//        this.tomato = tomato;
//    }
//
//    public boolean isPepperoni() {
//        return pepperoni;
//    }
//
//    public void setPepperoni(boolean pepperoni) {
//        this.pepperoni = pepperoni;
//    }
//
//    public boolean isMozzarella() {
//        return mozzarella;
//    }
//
//    public void setMozzarella(boolean mozzarella) {
//        this.mozzarella = mozzarella;
//    }
//
//    public boolean isOlives() {
//        return olives;
//    }
//
//    public void setOlives(boolean olives) {
//        this.olives = olives;
//    }
//
//    public String getDim() {
//        return dim;
//    }
//
//    public void setDim(String dim) {
//        this.dim = dim;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tomato=" + tomato +
                ", pepperoni=" + pepperoni +
                ", mozzarella=" + mozzarella +
                ", olives=" + olives +
                ", dim='" + dim + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
