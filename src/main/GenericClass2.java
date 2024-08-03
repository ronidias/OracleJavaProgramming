package main;

import lombok.Getter;
import lombok.Setter;


public class GenericClass2 <T1,T2> {

        //Properties
        private T1 password;
        private T2 description;

        //Constructor

        public GenericClass2(){};
        public GenericClass2(T1 password, T2 description) {
            this.password = password;
            this.description = description;

        }

        //Behaviors

        public T1 getPassword() {
            return password;
        }
        public void setPassword(T1 password) {
            this.password = password;
        }

        public T2 getDescription() {
        return description;
    }

        public void setDescription(T2 description) {
        this.description = description;
    }
}

