    package com.company.tonypsr;

    public class Main {

        public static void main(String[] args)
        {
            Student s=new Student();
            try{
                s.getDetails();
                s.printDetails();
            }catch(MarkException e) {
                System.out.println(e);
            }

        }

    }
