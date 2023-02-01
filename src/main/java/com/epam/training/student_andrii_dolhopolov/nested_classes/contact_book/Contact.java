package com.epam.training.student_andrii_dolhopolov.nested_classes.contact_book;



public class Contact {
    String contact_Name;
    ContactInfo phoneNumber;
    Email[] emails_arr = new Email[3];
    //ContactInfo[] emails_arr = new ContactInfo[3];
    int emailsAmount;
    int socialMediaLinksAmount;

    private class NameContactInfo implements ContactInfo{

        @Override
        public String getTitle() {
            return "Name";
        }

        @Override
        public String getValue() {
            return contact_Name;
        }
    }

    public static class Email implements ContactInfo{
        public String email_title;
        public String email_str;
        @Override
        public String getTitle() {
            return email_title;
        }

        @Override
        public String getValue() {
            return email_str;
        }
    }

    public  static class Social implements ContactInfo{
        public static ContactInfo[]social_arr = new ContactInfo[5];
        public static void saveSocialLink( int i, String s_title, String s_id) {
            social_arr[i] = new ContactInfo() {
                @Override
                public String getTitle() {
                    return s_title;
                }

                @Override
                public String getValue() {
                    return s_id;
                }
            };
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public String getValue() {
            return null;
        }
    }

    public Contact(String contactName) {
        this.contact_Name = contactName;
    }

    public void rename(String newName) {
        if(newName != null && !newName.equals("")) {
            this.contact_Name = newName;
        }
    }

    public Email addEmail(String localPart, String domain) {
        String title = "Email", email = String.format("%s@%s", localPart, domain);
        if (this.emailsAmount < 3){
            Contact.Email ex = new Contact.Email();
            ex.email_title = title;
            ex.email_str = email;
            this.emails_arr[this.emailsAmount] = ex;
            this.emailsAmount++;
            return ex;
        }
        return null;
    }
    public Email addEpamEmail(String firstname, String lastname) {
        String title = "Epam Email", email = String.format("%s@%s", firstname+"_"+lastname, "epam.com");
        if (this.emailsAmount < 3){
            Contact.Email ex = new Contact.Email();
            ex.email_title = title;
            ex.email_str = email;
            this.emails_arr[this.emailsAmount] = ex;
            this.emailsAmount++;
            return ex;
        }
        return null;
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        if (this.phoneNumber==null) {
            this.phoneNumber = new ContactInfo() {
                @Override
                public String getTitle() {
                    return "Tel";
                }

                @Override
                public String getValue() {
                    return String.format("+%d %s", code, number);
                }
            };
            return this.phoneNumber;
        } else {
            return null;
        }
    }

    public Social addTwitter(String twitterId) {
        if (this.socialMediaLinksAmount < 5){
            Contact.Social twitter = new Contact.Social();
            Social.saveSocialLink(this.socialMediaLinksAmount,"Twitter", twitterId);
            this.socialMediaLinksAmount++;
            return twitter;
        }
        return null;
    }

    public Social addInstagram(String instagramId) {
        if (this.socialMediaLinksAmount < 5){
            Contact.Social instagram = new Contact.Social();
            Social.saveSocialLink(this.socialMediaLinksAmount,"Instagram", instagramId);
            this.socialMediaLinksAmount++;
            return instagram;
        }
        return null;
    }

    public Social addSocialMedia(String title, String id) {
        if (this.socialMediaLinksAmount < 5){
            Contact.Social socialMedia = new Contact.Social();
            Social.saveSocialLink(this.socialMediaLinksAmount, title, id);
            this.socialMediaLinksAmount++;
            return socialMedia;
        }
        return null;
    }

    public ContactInfo[] getInfo() {
        /*
        One more method that the Contact class have is the getInfo() method.
        This method returns an array containing the ContactInfo entries in the following order:
        */
        int resLength = 1+this.emailsAmount+this.socialMediaLinksAmount;
        if (phoneNumber != null) {
            resLength++;
        }
        ContactInfo[] res = new ContactInfo[resLength];

        int i = 0;
        res[i] = new NameContactInfo();
        i++;
        if (phoneNumber != null) {
            res[i] = this.phoneNumber;//phone number contact info (if set)
            i++;
        }

        for (int j = 0; j < this.emailsAmount; j++) {
            //res[i] = Email.email1[j];
            res[i] = this.emails_arr[j];
            i++;
        }
        for (int j = 0; j < this.socialMediaLinksAmount; j++) {
            res[i] = Social.social_arr[j];
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        Contact contact = new Contact("William the Conqueror");

        Contact.Email email1 = contact.addEpamEmail("william", "legitimate");
        Contact.Email email2 = contact.addEmail("william", "normandy.fr");

        System.out.println(Contact.Email.class);
        System.out.println(email1.getClass());
        //assertTrue(email1 instanceof Contact.Email);

       // assertEquals(Contact.Email.class, email2.getClass());

        //assertEquals(contact.getInfo().length, 3);
    }
}
