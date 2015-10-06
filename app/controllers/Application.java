package controllers;

import com.avaje.ebean.Ebean;
import play.data.Form;
import play.mvc.*;
import models.Item;;

public class Application extends Controller {

    private static final Form<Item> item =Form.form(Item.class);

    public static Result index() {

        return ok(views.html.index.render("Add Items",item));
    }

    public static Result save(){
        Form<Item> boundform = item.bindFromRequest();
        Item i = boundform.get();
        Ebean.save(i);
        return ok("saved item");
    }

}
