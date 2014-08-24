package com.happyviking.controller.mailinglist;


import com.happyviking.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MailingListAPIController {

    @RequestMapping(value="/", method = RequestMethod.GET, produces = { "application/json", "text/html" })
    public @ResponseBody List<User> get(HttpServletResponse response) throws IOException {

        return new ArrayList<User>() {{
            add(new User("jason", "stoltzfus", "test@user.com"));
        }};
    }

}