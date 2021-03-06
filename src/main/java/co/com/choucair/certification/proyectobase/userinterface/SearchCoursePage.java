package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage  extends PageObject {

    public static final Target BUTTON_UC = Target.the("Selecciona cursos y certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[contains(@class, 'btn btn-secondary') and contains(text(),'Ir')]"));

    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//div[contains(@class,'course-title')]/h4"));

    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h3[contains(@class,'coursename')]/a"));
}
