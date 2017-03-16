package hello;

/**
 * Created by a1 on 15.03.17.
 */
public class UserComands {

    String hostAdress = "http://localhost:8080/people";

    String serviceInformation() {
//        curl http://localhost:8080/people
        String command = String.format("curl http://localhost:8080");
        return command;
    }

    String allPersons() {
//        curl http://localhost:8080/people
        String command = String.format("curl %s", this.hostAdress);
        return command;
    }

    String crateNewPerson(String firstName, String lastName) {
        String command =
            String.format("curl -i -X POST -H \"Content-Type:application/json\" -d " +
                "'{  \"firstName\" : %s,  \"lastName\" : %s }' " + this.hostAdress, firstName, lastName);
        return command;
    }

    String deletePerson(String personHref) {
//        http://localhost:8080/people/53149b8e3004990b1af9f229
        String command =
                String.format("curl -X DELETE %s/%s", this.hostAdress, personHref);
        return command;
    }

    String findByEmail(String email) {
//        "curl http://localhost:8080/people/search/findByLastName?name=Baggins"
        String command =
            String.format("curl %s//search/findByEmail?email=%s", this.hostAdress, email);
        return command;
    }

    String updateEmail(String email) {
//        curl -X PATCH -H "Content-Type:application/json" -d
//              "{ \"firstName\": \"Bilbo Jr.\" }"
//              http://localhost:8080/people/58c9a43659dfe70d3d438a1f
        String hrefCode = "58c9a43659dfe70d3d438a1f";
        String command =
            String.format(
                    "curl -X PATCH -H \"Content-Type:application/json\" -d " +
                    "\"{ \\\"email\\\": \\\"%s\\\" }\"" +
                    "%s//%s", email, this.hostAdress, hrefCode);
        return command;
    }

    String updateBirthday(String birthday) {
        /*Birthday formats:
            \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\",
            \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\",
            \"EEE, dd MMM yyyy HH:mm:ss zzz\",
            \"yyyy-MM-dd\"
        */
        String hrefCode = "58c9a43659dfe70d3d438a1f";
        String command =
            String.format(
                    "curl -X PATCH -H \"Content-Type:application/json\" -d " +
                    "\"{ \\\"email\\\": \\\"%s\\\" }\"" +
                    "%s//%s", birthday, this.hostAdress, hrefCode);
        return command;
    }



}
