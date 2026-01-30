/**
 */
package cms_association.cmsassociation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Media Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cms_association.cmsassociation.CmsassociationPackage#getMediaType()
 * @model
 * @generated
 */
public enum MediaType implements Enumerator {
	/**
	 * The '<em><b>IMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(0, "IMAGE", "IMAGE"),

	/**
	 * The '<em><b>PDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDF_VALUE
	 * @generated
	 * @ordered
	 */
	PDF(1, "PDF", "PDF"),

	/**
	 * The '<em><b>VIDEO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO(2, "VIDEO", "VIDEO"),

	/**
	 * The '<em><b>AUTRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTRE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTRE(3, "AUTRE", "AUTRE");

	/**
	 * The '<em><b>IMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 0;

	/**
	 * The '<em><b>PDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PDF_VALUE = 1;

	/**
	 * The '<em><b>VIDEO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_VALUE = 2;

	/**
	 * The '<em><b>AUTRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTRE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Media Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MediaType[] VALUES_ARRAY = new MediaType[] { IMAGE, PDF, VIDEO, AUTRE, };

	/**
	 * A public read-only list of all the '<em><b>Media Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MediaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Media Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MediaType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MediaType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MediaType get(int value) {
		switch (value) {
		case IMAGE_VALUE:
			return IMAGE;
		case PDF_VALUE:
			return PDF;
		case VIDEO_VALUE:
			return VIDEO;
		case AUTRE_VALUE:
			return AUTRE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MediaType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //MediaType
