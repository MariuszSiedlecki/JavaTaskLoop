package phoneBookAddDeletShow;

import java.util.Scanner;

public class PhoneBook {

    private Scanner scanner = new Scanner(System.in);
    private Contact[] contactList = new Contact[100];

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.startMain();
    }

    private void startMain() {
        do {
            System.out.println("Welcome to phone book ");
            System.out.println("1 - add contact");
            System.out.println("2 - show all contact");
            System.out.println("3 - delete contact name");
            System.out.println("4 - exit");

            choice(Integer.parseInt(insertChoice()));

        } while (true);
    }

    private String insertChoice() {
        System.out.println("Your choice: ");
        return scanner.nextLine();
    }

    private void choice(int userChoice) {
        switch (userChoice) {
            case 1 : {
                addContact();
                break;
            }
            case 2: {
                showAllContact();
                break;
            }
            case 3: {
                removeContactName();
                break;
            }
            default:
                System.out.println("The end");
                break;
        }
    }

    private void addContact(){
        System.out.println("Give your name:");
        String nameFromUser = scanner.nextLine();
        System.out.println("Give your surname:");
        String surnameFromUser = scanner.nextLine();
        System.out.println("Give phone number:");
        String numberFromUser = scanner.nextLine();

        Contact contact = new Contact(nameFromUser,surnameFromUser,numberFromUser);

        for (int i = 0; i <contactList.length ; i++) {
            if(contactList[i]==null){
                contactList[i]= contact;
                break;
            }

        }
    }

    private void showAllContact(){
        for (Contact contact : contactList) {
            if (contact != null) {
                System.out.println(contact.getName() + "  " + contact.getSurname() + ", phone:" + contact.getPhoneNumber());
            } else {
                break;
            }
        }
    }
    private void  removeContactName(){
        Contact[]contactSecond = contactList;
        System.out.print("give contact for remove (name):");
        String contactToRemove = scanner.nextLine();
        for (int i = 0; i <contactList.length ; i++) {
            if(contactList[i]!= null&& contactList[i].getName().equals(contactToRemove)){
                for (int j = 0; j <contactList.length ; j++) {
                    contactList[i] = contactSecond[i+1];
                }
                contactList[contactList.length-1]=null;
                contactSecond=contactList;
            }

        }
    }
}
