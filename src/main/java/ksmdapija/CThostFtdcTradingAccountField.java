package ksmdapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u02bd\ufffd\ufffd\u02fb\ufffd<br>
 * <i>native declaration : kingstarapi/linux/libfiles/KSUserApiStructEx.h:524</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ksmdapija") 
public class CThostFtdcTradingAccountField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\u03f4\ufffd\ufffd\ufffd\u047a\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(2) 
	public double PreMortgage() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \ufffd\u03f4\ufffd\ufffd\ufffd\u047a\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(2) 
	public CThostFtdcTradingAccountField PreMortgage(double PreMortgage) {
		this.io.setDoubleField(this, 2, PreMortgage);
		return this;
	}
	/**
	 * \ufffd\u03f4\ufffd\ufffd\ufffd\ufffd\u00f6\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public double PreCredit() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\u03f4\ufffd\ufffd\ufffd\ufffd\u00f6\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public CThostFtdcTradingAccountField PreCredit(double PreCredit) {
		this.io.setDoubleField(this, 3, PreCredit);
		return this;
	}
	/**
	 * \ufffd\u03f4\u03b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public double PreDeposit() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\u03f4\u03b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public CThostFtdcTradingAccountField PreDeposit(double PreDeposit) {
		this.io.setDoubleField(this, 4, PreDeposit);
		return this;
	}
	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public double PreBalance() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public CThostFtdcTradingAccountField PreBalance(double PreBalance) {
		this.io.setDoubleField(this, 5, PreBalance);
		return this;
	}
	/**
	 * \ufffd\u03f4\ufffd\u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public double PreMargin() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \ufffd\u03f4\ufffd\u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public CThostFtdcTradingAccountField PreMargin(double PreMargin) {
		this.io.setDoubleField(this, 6, PreMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public double InterestBase() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public CThostFtdcTradingAccountField InterestBase(double InterestBase) {
		this.io.setDoubleField(this, 7, InterestBase);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public double Interest() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public CThostFtdcTradingAccountField Interest(double Interest) {
		this.io.setDoubleField(this, 8, Interest);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public double Deposit() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public CThostFtdcTradingAccountField Deposit(double Deposit) {
		this.io.setDoubleField(this, 9, Deposit);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public double Withdraw() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public CThostFtdcTradingAccountField Withdraw(double Withdraw) {
		this.io.setDoubleField(this, 10, Withdraw);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public double FrozenMargin() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public CThostFtdcTradingAccountField FrozenMargin(double FrozenMargin) {
		this.io.setDoubleField(this, 11, FrozenMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public double FrozenCash() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public CThostFtdcTradingAccountField FrozenCash(double FrozenCash) {
		this.io.setDoubleField(this, 12, FrozenCash);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(13) 
	public double FrozenCommission() {
		return this.io.getDoubleField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(13) 
	public CThostFtdcTradingAccountField FrozenCommission(double FrozenCommission) {
		this.io.setDoubleField(this, 13, FrozenCommission);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01f0\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\u0736\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14) 
	public double CurrMargin() {
		return this.io.getDoubleField(this, 14);
	}
	/**
	 * \ufffd\ufffd\u01f0\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\u0736\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14) 
	public CThostFtdcTradingAccountField CurrMargin(double CurrMargin) {
		this.io.setDoubleField(this, 14, CurrMargin);
		return this;
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(15) 
	public double CashIn() {
		return this.io.getDoubleField(this, 15);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(15) 
	public CThostFtdcTradingAccountField CashIn(double CashIn) {
		this.io.setDoubleField(this, 15, CashIn);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(16) 
	public double Commission() {
		return this.io.getDoubleField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(16) 
	public CThostFtdcTradingAccountField Commission(double Commission) {
		this.io.setDoubleField(this, 16, Commission);
		return this;
	}
	/**
	 * \u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(17) 
	public double CloseProfit() {
		return this.io.getDoubleField(this, 17);
	}
	/**
	 * \u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(17) 
	public CThostFtdcTradingAccountField CloseProfit(double CloseProfit) {
		this.io.setDoubleField(this, 17, CloseProfit);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(18) 
	public double PositionProfit() {
		return this.io.getDoubleField(this, 18);
	}
	/**
	 * \ufffd\u05b2\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(18) 
	public CThostFtdcTradingAccountField PositionProfit(double PositionProfit) {
		this.io.setDoubleField(this, 18, PositionProfit);
		return this;
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(19) 
	public double Balance() {
		return this.io.getDoubleField(this, 19);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(19) 
	public CThostFtdcTradingAccountField Balance(double Balance) {
		this.io.setDoubleField(this, 19, Balance);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(20) 
	public double Available() {
		return this.io.getDoubleField(this, 20);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(20) 
	public CThostFtdcTradingAccountField Available(double Available) {
		this.io.setDoubleField(this, 20, Available);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0221\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(21) 
	public double WithdrawQuota() {
		return this.io.getDoubleField(this, 21);
	}
	/**
	 * \ufffd\ufffd\u0221\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(21) 
	public CThostFtdcTradingAccountField WithdrawQuota(double WithdrawQuota) {
		this.io.setDoubleField(this, 21, WithdrawQuota);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(22) 
	public double Reserve() {
		return this.io.getDoubleField(this, 22);
	}
	/**
	 * \ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(22) 
	public CThostFtdcTradingAccountField Reserve(double Reserve) {
		this.io.setDoubleField(this, 22, Reserve);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(24) 
	public int SettlementID() {
		return this.io.getIntField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(24) 
	public CThostFtdcTradingAccountField SettlementID(int SettlementID) {
		this.io.setIntField(this, 24, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u00f6\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(25) 
	public double Credit() {
		return this.io.getDoubleField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\u00f6\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(25) 
	public CThostFtdcTradingAccountField Credit(double Credit) {
		this.io.setDoubleField(this, 25, Credit);
		return this;
	}
	/**
	 * \ufffd\ufffd\u047a\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(26) 
	public double Mortgage() {
		return this.io.getDoubleField(this, 26);
	}
	/**
	 * \ufffd\ufffd\u047a\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(26) 
	public CThostFtdcTradingAccountField Mortgage(double Mortgage) {
		this.io.setDoubleField(this, 26, Mortgage);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(27) 
	public double ExchangeMargin() {
		return this.io.getDoubleField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(27) 
	public CThostFtdcTradingAccountField ExchangeMargin(double ExchangeMargin) {
		this.io.setDoubleField(this, 27, ExchangeMargin);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07fd\ufffd\ufffd\uec63\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(28) 
	public double DeliveryMargin() {
		return this.io.getDoubleField(this, 28);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07fd\ufffd\ufffd\uec63\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(28) 
	public CThostFtdcTradingAccountField DeliveryMargin(double DeliveryMargin) {
		this.io.setDoubleField(this, 28, DeliveryMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\uec63\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(29) 
	public double ExchangeDeliveryMargin() {
		return this.io.getDoubleField(this, 29);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\uec63\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(29) 
	public CThostFtdcTradingAccountField ExchangeDeliveryMargin(double ExchangeDeliveryMargin) {
		this.io.setDoubleField(this, 29, ExchangeDeliveryMargin);
		return this;
	}
	public CThostFtdcTradingAccountField() {
		super();
	}
	public CThostFtdcTradingAccountField(Pointer pointer) {
		super(pointer);
	}
}
