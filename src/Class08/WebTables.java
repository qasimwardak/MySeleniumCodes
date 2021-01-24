package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTables {
    public static void main(String[] args) {
        String url = "http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
        System.out.println(rowData.size());
        Iterator<WebElement> iterator = rowData.iterator();
        while (iterator.hasNext()) {
            WebElement row = iterator.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }

        List<WebElement> colData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(colData.size());
        for (WebElement col:colData) {
            String colText = col.getText();
            System.out.println(colText);
        }
        /*Iterator<WebElement> iterator1 = colData.iterator();
        while (iterator1.hasNext()) {
            WebElement col = iterator1.next();
            String colText = col.getText();
            System.out.println(colText);
        }*/

    }
}