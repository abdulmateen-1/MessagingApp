import MessageListItem from './MessageListItem.js';
import lifecyleLogger from './mixins/lifecycle-logger.mixin.js';
export default {
    name: 'MessageList',
    mixins: [lifecyleLogger],
    template: `<ul>
            <message-list-item v-for="item in items" :item="item" @delete="deleteMessage(item)"></message-list-item>
        </ul>
    `,
    props: {
        items: {
            type: Array,
            required: true
        }
    },
    methods: {
        deleteMessage(message) {
            this.$emit('delete', message); // The $emit allows the parent to listen to the event delete
        }
    },
    components: {
        MessageListItem
    }
}