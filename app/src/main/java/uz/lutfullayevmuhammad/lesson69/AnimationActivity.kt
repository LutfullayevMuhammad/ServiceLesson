package uz.lutfullayevmuhammad.lesson69

import android.animation.Animator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.lutfullayevmuhammad.lesson69.databinding.ActivityAnimationBinding

class AnimationActivity : AppCompatActivity() {

    private val binding: ActivityAnimationBinding by lazy {
        ActivityAnimationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.harakatlantirgich.setOnClickListener {

//            binding.tajribaButton.translationX=200f
//            binding.tajribaButton.translationY=200f
//            binding.tajribaButton.translationZ=2000f

//            binding.tajribaButton.x=100f
//            binding.tajribaButton.y=100f
//            binding.tajribaButton.z=100f
//            binding.tajribaButton.x=100f

//            binding.tajribaButton.width=100
//            binding.tajribaButton.height=1000

//            binding.tajribaButton.rotationX=90f
//            binding.tajribaButton.rotationY=45f
//            binding.tajribaButton.rotation=45f

//            binding.tajribaButton.scaleX=2f
//            binding.tajribaButton.scaleY=2f

//            binding.tajribaButton.alpha=0.01f
//            binding.tajribaImage.animate().rotation(3600000f).setDuration(5_000).start()
//            binding.tajribaImage.animate().rotation(3600000f).setDuration(5_000).start()

//            binding.tajribaButton.animate().translationXBy(100f).setDuration(1_000).start()
//            binding.tajribaButton.animate().rotationBy(45f).setDuration(5_00).start()

            startSizeAnimation()

        }
    }

    fun startSizeAnimation() {
        binding.tajribaButton.animate().translationXBy(100f).setDuration(1_000)
            .setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator?) {

                }

                override fun onAnimationEnd(animation: Animator?) {
//                    startSizeAnimation()
                }

                override fun onAnimationCancel(animation: Animator?) {

                }

                override fun onAnimationRepeat(animation: Animator?) {

                }

            })
            .start()


    }

}