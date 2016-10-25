package varB7;

/**
 * Created by sasha_koroleva on 23.10.2016.
 */

public class Apple extends Food {

        protected String size;

        public Apple(String name) {
        }

        public Apple(String name, String size) {
            super(name);
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        @Override
        public void consume() {
            System.out.println(name + " " + size + " - съедено");
        }

        @Override
        public String toString() {
            return super.toString() + " " +size;

        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            if (this.name == ((Apple) obj).getName() && this.size == ((Apple) obj).getSize()) {
                return true;
            }
            return false;
        }

        @Override
        public double calculateCalories() {
            if (size == "большое") {
                return 104.0;
            }
            if (size == "среднее") {
                return 78.0;
            }
            if (size == "маленькое") {
                return 52.0;
            }
            return 0;
        }
    }

