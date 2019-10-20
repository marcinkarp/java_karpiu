package ru.stqa.pft.addressbook;

public class GroupContacts {
  private final String name;
  private final String lastname;
  private final String company;
  private final String adress;
  private final String number;
  private final String email;

  public GroupContacts(String name, String lastname, String company, String adress, String number, String email) {
    this.name = name;
    this.lastname = lastname;
    this.company = company;
    this.adress = adress;
    this.number = number;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCompany() {
    return company;
  }

  public String getAdress() {
    return adress;
  }

  public String getNumber() {
    return number;
  }

  public String getEmail() {
    return email;
  }
}
