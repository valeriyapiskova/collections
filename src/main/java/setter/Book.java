package setter;

import java.util.Objects;

public class Book {

        private String name;

        public Book(String name){
            this.name = name;

        }

        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }


        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return name;
        }
    }



