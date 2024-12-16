import java.util.Scanner;

public class YogaSuggestion {

    // Method to provide yoga suggestions based on the problem
    public static void provideYogaSuggestion(String problem) {
        switch (problem.toLowerCase()) {
            case "stress":
                System.out.println("Yoga Suggestions for Stress and Anxiety:");
                System.out.println("- Child’s Pose (Balasana): A restful pose that calms the mind.");
                System.out.println("- Cat-Cow Pose (Marjaryasana-Bitilasana): Helps release tension in the spine.");
                System.out.println("- Legs-Up-the-Wall Pose (Viparita Karani): A restorative pose for relaxation.");
                System.out.println("- Pranayama (Breathing exercises): Try Nadi Shodhana or Box Breathing for calming.");
                break;

            case "back pain":
                System.out.println("Yoga Suggestions for Back Pain or Poor Posture:");
                System.out.println("- Downward Dog (Adho Mukha Svanasana): Stretches the spine, shoulders, and hamstrings.");
                System.out.println("- Cobra Pose (Bhujangasana): Opens the chest and strengthens the lower back.");
                System.out.println("- Bridge Pose (Setu Bandhasana): Strengthens the glutes and back muscles.");
                System.out.println("- Seated Forward Fold (Paschimottanasana): Stretches the hamstrings and lower back.");
                break;

            case "insomnia":
                System.out.println("Yoga Suggestions for Insomnia or Poor Sleep:");
                System.out.println("- Reclining Bound Angle Pose (Supta Baddha Konasana): Opens the hips and promotes deep relaxation.");
                System.out.println("- Legs-Up-the-Wall Pose (Viparita Karani): Calms the nervous system and promotes restful sleep.");
                System.out.println("- Savasana (Corpse Pose): A deep relaxation pose to release tension and quiet the mind.");
                System.out.println("- Supported Child’s Pose: Comfortably relax and release stress.");
                break;

            case "flexibility":
                System.out.println("Yoga Suggestions for Improving Flexibility:");
                System.out.println("- Downward Dog (Adho Mukha Svanasana): A full-body stretch targeting hamstrings and calves.");
                System.out.println("- Lunge Pose (Anjaneyasana): Opens the hips and stretches the quadriceps.");
                System.out.println("- Pigeon Pose (Eka Pada Rajakapotasana): Stretches the hips and glutes.");
                System.out.println("- Wide-Legged Forward Fold (Prasarita Padottanasana): Stretches the hamstrings and inner thighs.");
                break;

            case "fatigue":
                System.out.println("Yoga Suggestions for Low Energy or Fatigue:");
                System.out.println("- Sun Salutations (Surya Namaskar): A series of dynamic movements to boost energy.");
                System.out.println("- Warrior I & II (Virabhadrasana I & II): Builds strength and stamina.");
                System.out.println("- Tree Pose (Vrksasana): Improves balance and energizes the body.");
                System.out.println("- Camel Pose (Ustrasana): Opens the chest and increases energy flow.");
                break;

            case "digestive issues":
                System.out.println("Yoga Suggestions for Digestive Health:");
                System.out.println("- Seated Forward Fold (Paschimottanasana): Compresses the abdomen and stimulates digestion.");
                System.out.println("- Supine Twist (Supta Matsyendrasana): A gentle twist that massages the internal organs.");
                System.out.println("- Wind-Relieving Pose (Pavanmuktasana): Helps release gas and bloating.");
                System.out.println("- Cat-Cow Pose (Marjaryasana-Bitilasana): Gently massages the stomach and intestines.");
                break;

            case "mental clarity":
                System.out.println("Yoga Suggestions for Mental Clarity and Focus:");
                System.out.println("- Tree Pose (Vrksasana): A balancing pose that improves focus.");
                System.out.println("- Warrior III (Virabhadrasana III): Improves balance and stability.");
                System.out.println("- Eagle Pose (Garudasana): Enhances mental clarity and concentration.");
                System.out.println("- Mountain Pose (Tadasana): Helps with grounding and presence.");
                break;

            case "headaches":
                System.out.println("Yoga Suggestions for Headaches or Migraines:");
                System.out.println("- Child’s Pose (Balasana): Releases tension in the neck and shoulders.");
                System.out.println("- Seated Forward Fold (Paschimottanasana): Relieves pressure in the head and neck.");
                System.out.println("- Cat-Cow Pose (Marjaryasana-Bitilasana): Helps release tension in the upper back and neck.");
                System.out.println("- Supported Savasana: Restorative pose to reduce stress and alleviate headache pain.");
                break;

            default:
                System.out.println("Sorry, we don't have suggestions for that problem. Please enter a valid problem.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the problem
        System.out.println("Enter a problem you are facing (e.g., stress, back pain, insomnia, etc.):");
        String problem = scanner.nextLine();

        // Provide the yoga suggestions based on the problem
        provideYogaSuggestion(problem);

        scanner.close();
    }
}
