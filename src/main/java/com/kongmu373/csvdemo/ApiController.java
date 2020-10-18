package com.kongmu373.csvdemo;

import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private UserService userService;

    /**
     * Handle request to the default page
     */
    @GetMapping("/")
    public void viewHome(HttpServletResponse response) throws IOException {
        response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv\"");

        List<User> users = (List<User>) userService.findAllUsers();
        String[] header = {"FirstName", "LastName", "LastName", "JobTitle", "Company", "Address", "City", "Country",
                "PhoneNumber"};
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
                CsvPreference.STANDARD_PREFERENCE);
        csvWriter.writeHeader(header);
        for (User user : users) {
            csvWriter.write(user, header);
        }
        csvWriter.close();
    }


}
