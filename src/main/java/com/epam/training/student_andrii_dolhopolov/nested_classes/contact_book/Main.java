package com.epam.training.student_andrii_dolhopolov.nested_classes.contact_book;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("William the Conqueror");

        contact.addEmail("william", "normandy.fr");
        contact.addEmail("william", "england.travel");

        contact.addEpamEmail("william", "conqueror");

        contact.addTwitter("@william1066");
        contact.addInstagram("@bayeux_tapestry");
        contact.addSocialMedia("Facebook", "la_manche_tours");

        contact.addPhoneNumber(44, "20-1066-1087");

        ContactInfo[] info = contact.getInfo();

        System.out.println("Name: William the Conqueror"+ " \n" + (info[0].getValue()));
        System.out.println("Tel: +44 20-1066-1087"+ " \n" + (info[1].getValue()));

        System.out.println("Email: william@normandy.fr"+ " \n" + (info[2].getValue()));
        System.out.println("Email: william@england.travel"+ " \n" +  (info[3].getValue()));
        System.out.println("Epam Email: william_conqueror@epam.com"+ " \n" +  (info[4].getValue()));

        System.out.println("Twitter: @william1066"+ " \n" +  (info[5].getValue()));
        System.out.println("Instagram: @bayeux_tapestry"+ " \n" +  (info[6].getValue()));
        System.out.println("Facebook: la_manche_tours"+ " \n" +  (info[7].getValue()));

        System.out.println(info.length + " \n" +  8);
    }

}
