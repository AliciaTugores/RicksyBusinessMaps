package edu.pingpong;

public class CreditCard {

        String owner;
        String number;
        private double credit = 3000d;
        private final String SYMBOL = "EZI";

        public CreditCard (String owner,String number){
            this.owner = owner;
            this.number = number;
        }

        boolean pay(double precio) {
            boolean payable = precio <= this.credit? true:false;
            if(payable){
                this.credit -= precio;
            }
            return payable;
        }

        String getOwner(){
            return this.owner;
        }

        String number(){
            return this.number;
        }

        double getCredit(){
            return this.credit;
        }

        void addOwner (){

            System.out.println("\n" + "Tarjeta de "+ getOwner() +"\n" +
                    "===================="+ "\n"+
                    "owner: "+ getOwner() + "\n"+
                    "number: "+ number() + "\n"
            );
        }

        double credit() {
            return this.credit;
        }
        @Override
        public String toString() {
            return "owner: " + this.owner
                    + "\nnumber: " + this.number
                    + "\ncredit: " + this.credit + this.SYMBOL;
        }
    }