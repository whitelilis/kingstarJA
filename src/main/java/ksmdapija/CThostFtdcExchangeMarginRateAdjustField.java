package ksmdapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\u02b5\ufffd\ufffd\ufffd<br>
 * <i>native declaration : kingstarapi/linux/libfiles/KSUserApiStructEx.h:973</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ksmdapija") 
public class CThostFtdcExchangeMarginRateAdjustField extends StructObject {
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
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(1) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(2) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(2) 
	public CThostFtdcExchangeMarginRateAdjustField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 2, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07f6\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(3) 
	public double LongMarginRatioByMoney() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07f6\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(3) 
	public CThostFtdcExchangeMarginRateAdjustField LongMarginRatioByMoney(double LongMarginRatioByMoney) {
		this.io.setDoubleField(this, 3, LongMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07f6\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public double LongMarginRatioByVolume() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07f6\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public CThostFtdcExchangeMarginRateAdjustField LongMarginRatioByVolume(double LongMarginRatioByVolume) {
		this.io.setDoubleField(this, 4, LongMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07ff\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public double ShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07ff\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public CThostFtdcExchangeMarginRateAdjustField ShortMarginRatioByMoney(double ShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 5, ShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07ff\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public double ShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07ff\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public CThostFtdcExchangeMarginRateAdjustField ShortMarginRatioByVolume(double ShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 6, ShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public double ExchLongMarginRatioByMoney() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public CThostFtdcExchangeMarginRateAdjustField ExchLongMarginRatioByMoney(double ExchLongMarginRatioByMoney) {
		this.io.setDoubleField(this, 7, ExchLongMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public double ExchLongMarginRatioByVolume() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public CThostFtdcExchangeMarginRateAdjustField ExchLongMarginRatioByVolume(double ExchLongMarginRatioByVolume) {
		this.io.setDoubleField(this, 8, ExchLongMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(9) 
	public double ExchShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(9) 
	public CThostFtdcExchangeMarginRateAdjustField ExchShortMarginRatioByMoney(double ExchShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 9, ExchShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public double ExchShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public CThostFtdcExchangeMarginRateAdjustField ExchShortMarginRatioByVolume(double ExchShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 10, ExchShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07f6\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(11) 
	public double NoLongMarginRatioByMoney() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07f6\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(11) 
	public CThostFtdcExchangeMarginRateAdjustField NoLongMarginRatioByMoney(double NoLongMarginRatioByMoney) {
		this.io.setDoubleField(this, 11, NoLongMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07f6\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public double NoLongMarginRatioByVolume() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07f6\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public CThostFtdcExchangeMarginRateAdjustField NoLongMarginRatioByVolume(double NoLongMarginRatioByVolume) {
		this.io.setDoubleField(this, 12, NoLongMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07ff\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(13) 
	public double NoShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07ff\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(13) 
	public CThostFtdcExchangeMarginRateAdjustField NoShortMarginRatioByMoney(double NoShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 13, NoShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07ff\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14) 
	public double NoShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u07ff\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14) 
	public CThostFtdcExchangeMarginRateAdjustField NoShortMarginRatioByVolume(double NoShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 14, NoShortMarginRatioByVolume);
		return this;
	}
	public CThostFtdcExchangeMarginRateAdjustField() {
		super();
	}
	public CThostFtdcExchangeMarginRateAdjustField(Pointer pointer) {
		super(pointer);
	}
}
