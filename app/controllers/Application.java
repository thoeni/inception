package controllers;


import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import play.data.Form;
import play.libs.Json;
import play.mvc.Result;
import services.UserService;
import views.html.index;

@org.springframework.stereotype.Controller
public class Application {

    @Autowired
    private UserService userService;

    public Result index() {
        return play.mvc.Controller.ok(index.render(Form.form(User.class)));
    }

    public Result addUser() {
        Form<User> form = Form.form(User.class).bindFromRequest();
        User user = form.get();
        userService.addUser(user);
        return play.mvc.Controller.redirect(controllers.routes.Application.index());
    }

    public Result listUsers() {
        return play.mvc.Controller.ok(Json.toJson(userService.getAllUsers()));
    }
    
}