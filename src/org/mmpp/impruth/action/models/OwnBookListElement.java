package org.mmpp.impruth.action.models;

import org.mmpp.impruth.model.OwnBook;
import org.mmpp.impruth.model.ReleaseInformation;

/**
 * 所有書籍情報表示カラム情報
 * @author kou
 *
 */
public class OwnBookListElement {
	/**
	 * バーコード
	 */
	private String _barcode;
	/**
	 * 書籍タイトル
	 */
	private String _title;
	/**
	 * 著者
	 */
	private String _author;
	/**
	 * 出版社
	 */
	private String _publisher;
	
	public String getBarcode() {
		return _barcode;
	}
	public void setBarcode(String barcode) {
		this._barcode = barcode;
	}
	public String getTitle() {
		return _title;
	}
	public void setTitle(String title) {
		this._title = title;
	}
	public String getAuthor() {
		return _author;
	}
	public void setAuthor(String author) {
		this._author = author;
	}
	public String getPublisher() {
		return _publisher;
	}
	public void setPublisher(String publisher) {
		this._publisher = publisher;
	}
	public static OwnBookListElement valueOf(OwnBook ownBook,ReleaseInformation release) {
		OwnBookListElement ownBookListElement = new OwnBookListElement();
		ownBookListElement.setBarcode(release.getBarcode());
		ownBookListElement.setTitle(release.getTitle());
		ownBookListElement.setAuthor(release.getAuthor());
		ownBookListElement.setPublisher(release.getPublisher());
		return ownBookListElement;
	}
	
}
