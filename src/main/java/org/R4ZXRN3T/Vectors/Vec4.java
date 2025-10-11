package org.R4ZXRN3T.Vectors;

/**
 * Represents a generic 4-dimensional vector with numeric components.
 * Supports basic vector arithmetic and utility operations.
 *
 * @param <T> the type of the numeric components, must extend {@link Number}. To be fully compatible with the implementation, it must be of type {@link Integer}, {@link Long}, {@link Float}, {@link Double}, {@link Short} or {@link Byte}.
 */
public class Vec4<T extends Number> {
	private T value1;
	private T value2;
	private T value3;
	private T value4;

	/**
	 * Constructs a new vector with the specified components.
	 *
	 * @param value1 the first component
	 * @param value2 the second component
	 * @param value3 the third component
	 * @param value4 the fourth component
	 */
	public Vec4(T value1, T value2, T value3, T value4) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.value4 = value4;
	}

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value) {
		this.value1 = value;
	}

	public T getValue2() {
		return value2;
	}

	public void setValue2(T value) {
		this.value2 = value;
	}

	public T getValue3() {
		return value3;
	}

	public void setValue3(T value) {
		this.value3 = value;
	}

	public T getValue4() {
		return value4;
	}

	public void setValue4(T value) {
		this.value4 = value;
	}

	@Override
	public String toString() {
		return "(" + value1 + ", " + value2 + ", " + value3 + ", " + value4 + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Vec4<?> vec4 = (Vec4<?>) obj;
		return value1.equals(vec4.value1) && value2.equals(vec4.value2) && value3.equals(vec4.value3) && value4.equals(vec4.value4);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(value1, value2, value3, value4);
	}

	/**
	 * Calculates the Euclidean length (magnitude) of the vector.
	 *
	 * @return the length of the vector
	 */
	public double getLength() {
		return Math.sqrt(
				Math.pow(value1.doubleValue(), 2) +
						Math.pow(value2.doubleValue(), 2) +
						Math.pow(value3.doubleValue(), 2) +
						Math.pow(value4.doubleValue(), 2)
		);
	}

	/**
	 * Adds another vector to this vector and returns the result.
	 */
	@SuppressWarnings("unchecked")
	public Vec4<T> add(Vec4<T> summand) {
		if (value1 instanceof Integer) {
			return new Vec4<>(
					(T) Integer.valueOf(value1.intValue() + summand.getValue1().intValue()),
					(T) Integer.valueOf(value2.intValue() + summand.getValue2().intValue()),
					(T) Integer.valueOf(value3.intValue() + summand.getValue3().intValue()),
					(T) Integer.valueOf(value4.intValue() + summand.getValue4().intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec4<>(
					(T) Long.valueOf(value1.longValue() + summand.getValue1().longValue()),
					(T) Long.valueOf(value2.longValue() + summand.getValue2().longValue()),
					(T) Long.valueOf(value3.longValue() + summand.getValue3().longValue()),
					(T) Long.valueOf(value4.longValue() + summand.getValue4().longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec4<>(
					(T) Float.valueOf(value1.floatValue() + summand.getValue1().floatValue()),
					(T) Float.valueOf(value2.floatValue() + summand.getValue2().floatValue()),
					(T) Float.valueOf(value3.floatValue() + summand.getValue3().floatValue()),
					(T) Float.valueOf(value4.floatValue() + summand.getValue4().floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec4<>(
					(T) Double.valueOf(value1.doubleValue() + summand.getValue1().doubleValue()),
					(T) Double.valueOf(value2.doubleValue() + summand.getValue2().doubleValue()),
					(T) Double.valueOf(value3.doubleValue() + summand.getValue3().doubleValue()),
					(T) Double.valueOf(value4.doubleValue() + summand.getValue4().doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec4<>(
					(T) Byte.valueOf((byte) (value1.byteValue() + summand.getValue1().byteValue())),
					(T) Byte.valueOf((byte) (value2.byteValue() + summand.getValue2().byteValue())),
					(T) Byte.valueOf((byte) (value3.byteValue() + summand.getValue3().byteValue())),
					(T) Byte.valueOf((byte) (value4.byteValue() + summand.getValue4().byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec4<>(
					(T) Short.valueOf((short) (value1.shortValue() + summand.getValue1().shortValue())),
					(T) Short.valueOf((short) (value2.shortValue() + summand.getValue2().shortValue())),
					(T) Short.valueOf((short) (value3.shortValue() + summand.getValue3().shortValue())),
					(T) Short.valueOf((short) (value4.shortValue() + summand.getValue4().shortValue()))
			);
		} else {
			throw new UnsupportedOperationException("Type not supported");
		}
	}

	/**
	 * Subtracts another vector from this vector and returns the result.
	 */
	@SuppressWarnings("unchecked")
	public Vec4<T> subtract(Vec4<T> subtrahend) {
		if (value1 instanceof Integer) {
			return new Vec4<>(
					(T) Integer.valueOf(value1.intValue() - subtrahend.getValue1().intValue()),
					(T) Integer.valueOf(value2.intValue() - subtrahend.getValue2().intValue()),
					(T) Integer.valueOf(value3.intValue() - subtrahend.getValue3().intValue()),
					(T) Integer.valueOf(value4.intValue() - subtrahend.getValue4().intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec4<>(
					(T) Long.valueOf(value1.longValue() - subtrahend.getValue1().longValue()),
					(T) Long.valueOf(value2.longValue() - subtrahend.getValue2().longValue()),
					(T) Long.valueOf(value3.longValue() - subtrahend.getValue3().longValue()),
					(T) Long.valueOf(value4.longValue() - subtrahend.getValue4().longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec4<>(
					(T) Float.valueOf(value1.floatValue() - subtrahend.getValue1().floatValue()),
					(T) Float.valueOf(value2.floatValue() - subtrahend.getValue2().floatValue()),
					(T) Float.valueOf(value3.floatValue() - subtrahend.getValue3().floatValue()),
					(T) Float.valueOf(value4.floatValue() - subtrahend.getValue4().floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec4<>(
					(T) Double.valueOf(value1.doubleValue() - subtrahend.getValue1().doubleValue()),
					(T) Double.valueOf(value2.doubleValue() - subtrahend.getValue2().doubleValue()),
					(T) Double.valueOf(value3.doubleValue() - subtrahend.getValue3().doubleValue()),
					(T) Double.valueOf(value4.doubleValue() - subtrahend.getValue4().doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec4<>(
					(T) Byte.valueOf((byte) (value1.byteValue() - subtrahend.getValue1().byteValue())),
					(T) Byte.valueOf((byte) (value2.byteValue() - subtrahend.getValue2().byteValue())),
					(T) Byte.valueOf((byte) (value3.byteValue() - subtrahend.getValue3().byteValue())),
					(T) Byte.valueOf((byte) (value4.byteValue() - subtrahend.getValue4().byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec4<>(
					(T) Short.valueOf((short) (value1.shortValue() - subtrahend.getValue1().shortValue())),
					(T) Short.valueOf((short) (value2.shortValue() - subtrahend.getValue2().shortValue())),
					(T) Short.valueOf((short) (value3.shortValue() - subtrahend.getValue3().shortValue())),
					(T) Short.valueOf((short) (value4.shortValue() - subtrahend.getValue4().shortValue()))
			);
		} else {
			throw new UnsupportedOperationException("Type not supported");
		}
	}

	/**
	 * Calculates the scalar (dot) product of this vector and another vector.
	 */
	public double scalarProduct(Vec4<T> other) {
		return value1.doubleValue() * other.getValue1().doubleValue()
				+ value2.doubleValue() * other.getValue2().doubleValue()
				+ value3.doubleValue() * other.getValue3().doubleValue()
				+ value4.doubleValue() * other.getValue4().doubleValue();
	}

	/**
	 * Returns the normalized (unit length) vector as a new Vec4<Double>.
	 */
	public Vec4<Double> normalize() {
		double len = getLength();
		if (len == 0) throw new ArithmeticException("Cannot normalize zero-length vector");
		return new Vec4<>(
				value1.doubleValue() / len,
				value2.doubleValue() / len,
				value3.doubleValue() / len,
				value4.doubleValue() / len
		);
	}
}