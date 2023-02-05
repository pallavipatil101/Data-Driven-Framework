package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Droppable_locators extends Base{

	public List<WebElement> droppableTabsList(){
		return driver.findElements(By.xpath("//*[@class='nav nav-tabs']/a"));
	}
	
	public WebElement draggableSimple() {
		return driver.findElement(By.id("draggable"));
	}
	
	public WebElement draggableAcceptable() {
		return driver.findElement(By.id("acceptable"));
	}
	
	public WebElement draggableNotAcceptable() {
		return driver.findElement(By.id("notAcceptable"));
	}
	
	public WebElement draggableRevertable() {
		return driver.findElement(By.id("revertable"));
	}
	
	public WebElement draggableNotRevertable() {
		return driver.findElement(By.id("notRevertable"));
	}
	
	public WebElement droppableSimple() {
		return driver.findElement(By.id("droppable"));
	}
	
	public WebElement droppableAccept() {
		return driver.findElement(By.xpath("//*[@id=\"acceptDropContainer\"]/div[2]"));
	}
	
	public WebElement droppableRevert() {
		return driver.findElement(By.xpath("//*[@id='revertableDropContainer']/div[2]"));
	}
	
	public WebElement droppedMessageSimple() {
		return driver.findElement(By.xpath("//*[@id='droppable']/p"));
	}
	
	public WebElement droppedMessageAccept() {
		return driver.findElement(By.xpath("//*[@id=\"acceptDropContainer\"]/div[2]/p"));
	}
	
	public WebElement droppableMessageRevert() {
		return driver.findElement(By.xpath("//*[@id='revertableDropContainer']/div[2]/p"));
	}
	
	public WebElement draggablePreventPropagation() {
		return driver.findElement(By.id("dragBox"));
	}
	
	public WebElement droppableOuterGreedy() {
		return driver.findElement(By.id("greedyDropBox"));
	}
	
	public WebElement outerGreedyMessage() {
		return driver.findElement(By.xpath("//*[@id='greedyDropBox']/p"));
	}
	
	public WebElement droppableOuterNotGreedy() {
		return driver.findElement(By.id("notGreedyDropBox"));
	}
	
	public WebElement outerNotGreedyMessage() {
		return driver.findElement(By.xpath("//*[@id='notGreedyDropBox']/p"));
	}
	
	public WebElement droppableInnerGreedy() {
		return driver.findElement(By.id("greedyDropBoxInner"));
	}
	
	public WebElement innerGreedyMessage() {
		return driver.findElement(By.xpath("//*[@id='greedyDropBoxInner']/p"));
	}
	
	public WebElement droppableInnerNotGreedy() {
		return driver.findElement(By.id("notGreedyInnerDropBox"));
	}
	
	public WebElement innerNotGreedyMessage() {
		return driver.findElement(By.xpath("//*[@id='notGreedyInnerDropBox']/p"));
	}
	
}
