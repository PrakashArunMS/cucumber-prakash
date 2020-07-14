package com.telecom.Objectfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonaction;

public class AddTariffPage extends Commonaction{
public AddTariffPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[text()='Add Tariff Plan']")
private WebElement AddtariffBtn;

@FindBy(name="rental")
private WebElement rentalMin;

@FindBy(name="local_minutes")
private WebElement localMinutes;

@FindBy(name="inter_minutes")
private WebElement interMinutes;
@FindBy(name="sms_pack")
private WebElement smsPack;
@FindBy(name="minutes_charges")
private WebElement minCharge;

@FindBy(name="inter_charges")
private WebElement interCharge;


@FindBy(name="sms_charges")
private WebElement smsCharges;


@FindBy(name="submit")
private WebElement submitBtnt;
@FindBy(xpath="//h2[text()='Congratulation you add Tariff Plan']")
private WebElement successMessages;
public WebElement getAddtariffBtn() {
	return AddtariffBtn;
}
public WebElement getRentalMin() {
	return rentalMin;
}
public WebElement getLocalMinutes() {
	return localMinutes;
}
public WebElement getInterMinutes() {
	return interMinutes;
}
public WebElement getSmsPack() {
	return smsPack;
}
public WebElement getMinCharge() {
	return minCharge;
}
public WebElement getInterCharge() {
	return interCharge;
}
public WebElement getSmsCharges() {
	return smsCharges;
}
public WebElement getSubmitBtnt() {
	return submitBtnt;
}
public WebElement getSuccessMessages() {
	return successMessages;
}


}
