import java.util.*;
/**
 * Converts a binary string to its decimal value using an iterative accumulator.
 *
 * <p>This method is mathematically equivalent to the standard binary expansion:
 *
 * <pre>
 *   For binary 101:
 *   1*2^2 + 0*2^1 + 1*2^0 = 5
 * </pre>
 *
 * <p>The same value can be computed iteratively by scanning digits from
 * left to right and updating an accumulator:
 *
 * <pre>
 *   acc = 0
 *   acc = acc*2 + digit
 * </pre>
 *
 * <p>Derivation:
 * Let the binary string be bₖ bₖ₋₁ ... b₁ b₀.
 * Starting with A₀ = 0, each step does:
 *
 * <pre>
 *   Aᵢ₊₁ = Aᵢ * 2 + bᵢ
 * </pre>
 *
 * Expanding this recurrence yields:
 *
 * <pre>
 *   Aₖ₊₁ = bₖ·2ᵏ + bₖ₋₁·2ᵏ⁻¹ + ... + b₀
 * </pre>
 *
 * which is exactly the standard binary-to-decimal formula.
 *
 * <p>If a modulus is applied after each step, e.g.:
 *
 * <pre>
 *   acc = ((acc * 2) + digit) % m
 * </pre>
 *
 * this computes the binary value modulo m while parsing.
 * This is useful in modular arithmetic, DFA construction,
 * and divisibility tests (e.g., checking if a binary string is divisible by 5).
 *
 * @param binary A string consisting of characters '0' and '1'.
 * @return decimal value of the binary number.
 */
public class BinaryPrefixDivBy5 {
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result=new ArrayList<>();
        int val=0;
        for(int ele:nums)
        {
            val=((val*2)+ele)%5;
            result.add(val==0);

        }
        return result;
    }
}
