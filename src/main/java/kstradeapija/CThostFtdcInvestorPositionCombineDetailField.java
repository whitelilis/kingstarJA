package kstradeapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f3\u05b2\ufffd\ufffd\ufffd\u03f8<br>
 * <i>native declaration : linuxapi/CTP/KSUserApiStructEx.h:2972</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("kstradeapija") 
public class CThostFtdcInvestorPositionCombineDetailField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > OpenDate() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(3) 
	public int SettlementID() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(3) 
	public CThostFtdcInvestorPositionCombineDetailField SettlementID(int SettlementID) {
		this.io.setIntField(this, 3, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(4) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u03f1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(6) 
	public Pointer<Byte > ComTradeID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u03f1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(7) 
	public Pointer<Byte > TradeID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(8) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(9) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(9) 
	public CThostFtdcInvestorPositionCombineDetailField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 9, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(10) 
	public byte Direction() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(10) 
	public CThostFtdcInvestorPositionCombineDetailField Direction(byte Direction) {
		this.io.setByteField(this, 10, Direction);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public int TotalAmt() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public CThostFtdcInvestorPositionCombineDetailField TotalAmt(int TotalAmt) {
		this.io.setIntField(this, 11, TotalAmt);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f1\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public double Margin() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f1\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public CThostFtdcInvestorPositionCombineDetailField Margin(double Margin) {
		this.io.setDoubleField(this, 12, Margin);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(13) 
	public double ExchMargin() {
		return this.io.getDoubleField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(13) 
	public CThostFtdcInvestorPositionCombineDetailField ExchMargin(double ExchMargin) {
		this.io.setDoubleField(this, 13, ExchMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(14) 
	public double MarginRateByMoney() {
		return this.io.getDoubleField(this, 14);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(14) 
	public CThostFtdcInvestorPositionCombineDetailField MarginRateByMoney(double MarginRateByMoney) {
		this.io.setDoubleField(this, 14, MarginRateByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd(\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(15) 
	public double MarginRateByVolume() {
		return this.io.getDoubleField(this, 15);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd(\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(15) 
	public CThostFtdcInvestorPositionCombineDetailField MarginRateByVolume(double MarginRateByVolume) {
		this.io.setDoubleField(this, 15, MarginRateByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0231\ufffd\ufffd<br>
	 * C type : TThostFtdcLegIDType
	 */
	@Field(16) 
	public int LegID() {
		return this.io.getIntField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0231\ufffd\ufffd<br>
	 * C type : TThostFtdcLegIDType
	 */
	@Field(16) 
	public CThostFtdcInvestorPositionCombineDetailField LegID(int LegID) {
		this.io.setIntField(this, 16, LegID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0233\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLegMultipleType
	 */
	@Field(17) 
	public int LegMultiple() {
		return this.io.getIntField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0233\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLegMultipleType
	 */
	@Field(17) 
	public CThostFtdcInvestorPositionCombineDetailField LegMultiple(int LegMultiple) {
		this.io.setIntField(this, 17, LegMultiple);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03f3\u05b2\u05ba\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(18) 
	public Pointer<Byte > CombInstrumentID() {
		return this.io.getPointerField(this, 18);
	}
	public CThostFtdcInvestorPositionCombineDetailField() {
		super();
	}
	public CThostFtdcInvestorPositionCombineDetailField(Pointer pointer) {
		super(pointer);
	}
}
