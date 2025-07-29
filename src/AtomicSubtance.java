public class AtomicSubtance {
    public static void main(String[] args){
        double moles;
        double particles = 1.204e24;

        moles = particles/6.022e23;
        System.out.printf("%.3e of particles is %.3f mol\n",particles,moles);

        double mass = 36;
        moles = mass/18;
        System.out.printf("%.1f g of mass is %.1f mol\n", mass, moles);

        double volume = 44.8;
        moles = volume / 22.4;
        System.out.printf("%.1f L of volume is %.1f mol\n", volume, moles);

        double concentration = 1.5;
        moles = concentration * 2.0;
        System.out.printf("%.1f mol/L of concentration is %.1f mol\n", volume, moles);
    }
}
