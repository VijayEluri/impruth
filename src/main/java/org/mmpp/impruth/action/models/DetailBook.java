package org.mmpp.impruth.action.models;

import org.mmpp.impruth.model.ShelfObject;

/**
 * 詳細ページ表示モデル
 * @author mmpp kou
 *
 */
public class DetailBook {

	/**
	 * タイトル
	 */
	private String _title;
	/**
	 * タイトル読みかな
	 */
	private String _titleKana;
	/**
	 * 通巻表記
	 */
	private Integer _number;
	/**
	 * 通巻表記
	 */
	private String _numberValue;
	/**
	 * 著者
	 */
	private String _authorName;
	/**
	 * 出版社
	 */
	private String _publishCompanyName;

	/**
	 * 管理ID
	 */
	private Integer _id;
	/**
	 * サブタイトル
	 */
	private String _subtitle;
	private String _publishSeriesName;
	private String _releaseDate;
	private String _barcode;
	
	public String getTitle() {
		return _title;
	}
	public void setTitle(String title) {
		this._title = title;
	}
	

	public String getTitleKana() {
		return _titleKana;
	}
	public void setTitleKana(String titleKana) {
		this._titleKana = titleKana;
	}

	public String getSubtitle() {
		return _subtitle;
	}
	public void setSubtitle(String subtitle) {
		this._subtitle = subtitle;
	}
	
	public Integer getNumber() {
		return _number;
	}
	public void setNumber(Integer number) {
		this._number = number;
	}

	public void setNumberValue(String numberValue) {
		this._numberValue = numberValue;
	}
	public String getNumberValue() {
		return _numberValue;
	}
	
	public String getAuthorName() {
		return _authorName;
	}
	public void setAuthorName(String authorName) {
		this._authorName = authorName;
	}
	public String getPublishCompanyName() {
		return _publishCompanyName;
	}
	public void setPublishCompanyName(String publishCompanyName) {
		this._publishCompanyName = publishCompanyName;
	}

	public void setId(Integer id) {
		_id = id;		
	}
	public Integer getId() {

		return _id;
	}
	public void setPublishSeriesName(String publishSeriesName) {
		_publishSeriesName = publishSeriesName;
	}
	public String getPublishSeriesName() {
		return _publishSeriesName;
	}

	public void setReleaseDate(String releaseDate) {
		_releaseDate = releaseDate;
	}
	public String getReleaseDate() {
		return _releaseDate;
	}
	public void setBarcode(String barcode) {
		_barcode = barcode;
	}
	public String getBarcode() {
		return _barcode;
	}
		
	public static DetailBook valueOf(ShelfObject shelfObject) {
		DetailBook detailBook = new DetailBook();
		detailBook.setTitle(shelfObject.getTitle());
		detailBook.setSubtitle(shelfObject.getSubtitle());
		detailBook.setTitleKana(shelfObject.getTitleKana());
		detailBook.setNumber(shelfObject.getNumber());
		detailBook.setNumberValue(shelfObject.getNumberValue());
		detailBook.setPublishCompanyName(shelfObject.getPublishCompanyName());
		detailBook.setAuthorName(shelfObject.getAuthorName());
		detailBook.setPublishSeriesName(shelfObject.getPublishSeriesName());
		detailBook.setId(shelfObject.getId());
		detailBook.setBarcode(shelfObject.getBarcode());

		if(shelfObject.getReleaseDate()!=null)
			detailBook.setReleaseDate(new java.text.SimpleDateFormat("yyyy/MM/dd").format(shelfObject.getReleaseDate()));
		return detailBook;
	}

}
